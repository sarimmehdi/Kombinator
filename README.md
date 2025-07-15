# Kombinator

[![Maven Central](https://img.shields.io/maven-central/v/io.github.sarimmehdi/kombinator)](https://search.maven.org/artifact/io.github.sarimmehdi/kombinator)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
<!-- Add other badges if you have them, e.g., build status, code coverage -->

Kombinator is a lightweight Kotlin library designed to generate all possible distinct instances (combinations) of a given data class. Provide Kombinator with a data class definition and the possible values for each of its properties, and it will systematically construct every unique combination.

This can be particularly useful for:

*   **Comprehensive Testing:** Easily generate a wide range of inputs for your unit tests to ensure all edge cases and scenarios are covered.
*   **Data Generation:** Quickly create diverse datasets for prototyping, mock data, or populating databases.
*   **State-Space Exploration:** Explore all possible states of simple objects or configurations.
*   **Property-Based Testing:** Serve as a foundation for generating inputs in property-based testing frameworks.
*   **Screenshot Testing:** Generate all possible screen configurations where needed

## Features

*   **Simple API:** Easy to use with a clear and concise API.
*   **Data Class Focused:** Designed specifically for Kotlin data classes.
*   **Type Safe:** Leverages Kotlin's type system.
*   **Efficient Combination Generation:** Systematically produces distinct combinations.
*   **Lightweight:** Minimal dependencies.

## Installation

Kombinator is available on Maven Central. You'll need to add the Kombinator library itself and KSP (Kotlin Symbol Processing) annotation processor for your project.

**Using Version Catalogs:**

`libs.versions.toml`:
```toml
[versions]
kombinatorVersion = "1.0.0"

[libraries]
kombinatorLibrary = { group = "io.github.sarimmehdi", name = "kombinator", version.ref = "kombinatorVersion" }
```
`build.gradle.kts` (module-level):
```kts
implementation(libs.kombinatorLibrary)
```

**Gradle (Kotlin DSL - `build.gradle.kts`):**:
```kts
implementation("io.github.sarimmehdi:kombinator:1.0.0")
```
**`build.gradle` (Groovy)**:
```groovy
implementation 'io.github.sarimmehdi:kombinator:1.0.0'
```

## Usage

Kombinator uses a single, versatile annotation, `@Kombine`, to define the values for generating combinations of your data classes.

1.  **Annotate your Data Class or its Parameters:**
    You have two primary ways to use the `@Kombine` annotation:
    *   **On a Data Class Property:** Apply `@Kombine` directly to a constructor parameter of your data class. In this case, you will use the specific typed array argument within `@Kombine` that matches the property's type to provide the possible values. For example, for an `Int` property, you'd use `allPossibleIntParams`.
    *   **On the Data Class itself:** Apply `@Kombine` to the entire data class. This usage is typically for more advanced scenarios or if you intend for Kombinator to infer or use default sets of values for properties that aren't individually annotated.

2.  **Define Property Values using `@Kombine` Arguments:**
    When annotating a property, you specify the possible values for that property using the corresponding typed array argument within the `@Kombine` annotation.

    *   For `String` properties: `allPossibleStringParams = ["value1", "value2"]`
    *   For `Int` properties: `allPossibleIntParams = [1, 2, 3]`
    *   For `Float` properties: `allPossibleFloatParams = [1.0f, 2.5f]`
    *   For `Double` properties: `allPossibleDoubleParams = [1.0, 2.5, 3.14]`
    *   For `Long` properties: `allPossibleLongParams = [100L, 200L]`
    *   For `Byte` properties: `allPossibleByteParams = [0b1, 0b10]`
    *   For `Char` properties: `allPossibleCharParams = ['a', 'b']`
    *   For `Short` properties: `allPossibleShortParams = [10, 20]`
    *   For `UByte` properties: `allPossibleUByteParams = [1u, 2u]` (ensure your project is configured for unsigned types)
    *   For `UShort` properties: `allPossibleUShortParams = [10u, 20u]`
    *   For `UInt` properties: `allPossibleUIntParams = [100u, 200u]`
    *   For `ULong` properties: `allPossibleULongParams = [1000uL, 2000uL]`
    *   For `Boolean` or `Enum` properties: `they are handled automatically`

3.  **Value Generation Rules - Key Behaviors:**

    *   **Property-Level `@Kombine` Overrides Class-Level `@Kombine`:** If a property has a `@Kombine` annotation directly on it, those specified values will be used for that property and not the values from the parameter array passed as an argument to the class-level `@Kombine` annotation
    *   **Default Property Values Are Final:** If a data class property has a default value defined in its constructor (e.g., `val myProp: String = "default"`), Kombinator will **always** use this default value. It will **not** generate any other combinations for this property, even if there's a `@Kombine` annotation on the property or the class specifying other values for it. The default value effectively makes that property constant for combination generation.
    *   **Class-Level `@Kombine` for Non-Annotated, Non-Defaulted Properties:** If a property does *not* have a `@Kombine` annotation and does *not* have a default value, Kombinator will look at the class-level `@Kombine` (if present) to find possible values for that property's type.
    *   **No Values Specified:** If a property (without a default value) is not annotated and the class-level `@Kombine` also doesn't provide values for its type (or there's no class-level `@Kombine`), Kombinator will throw an error that it is unable to generate combinations for the data class

4.  **Build your Project:**
    After annotating your data classes, build your project (e.g., using `./gradlew build` or by running the build from your IDE). The KSP processor will generate the combinations.

5.  **Access Generated Combinations:**
    Kombinator generates an `object` for each relevant data class. The name is `<DataClassName>Combinations` (e.g., `MyDataCombinations`). This object contains:
    *   **Individual pre-configured instances:** Public `val` properties, each representing a unique combination (e.g., `myData1`, `myData2`).
    *   **A `getAllCombinations()` method:** Returns a `List` of all generated instances.

## Example

This example demonstrates how `@Kombine` is used, including the effects of property-level annotations, class-level annotations, and default property values.

**1. Define your Data Class with `@Kombine` Annotations:**

Let's create a `ScreenConfig` data class:

```kotlin
@Kombine( // Class-level @Kombine: Provides defaults for unannotated, non-defaulted properties
allPossibleIntParams = [100],      // Default for 'padding' if not specified otherwise
allPossibleStringParams = ["system"] // Default for 'fontFamily'
)
data class ScreenConfig(
@Kombine(allPossibleStringParams = ["light", "dark", "auto"]) val theme: String, // Property-level overrides class-level for 'theme'
    val orientation: String = "portrait", // Has a default value, Kombinator will ONLY use "portrait"
    val padding: Int,                    // No property-level @Kombine, no default. Will use class-level: [100]
    @Kombine(allPossibleIntParams = [12, 16, 20]) // Property-level overrides class-level for 'fontSize'
    val fontSize: Int,
    val fontFamily: String,              // No property-level @Kombine, no default. Will use class-level: ["system"]
)
```

**2. Hit build and you will get the following generated code:

```kotlin
object ScreenConfigCombinations {

  val screenConfig1: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 12,
        padding = 100,
        theme = "light"
      )

  val screenConfig2: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 16,
        padding = 100,
        theme = "light"
      )

  val screenConfig3: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 20,
        padding = 100,
        theme = "light"
      )

  val screenConfig4: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 12,
        padding = 100,
        theme = "dark"
      )

  val screenConfig5: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 16,
        padding = 100,
        theme = "dark"
      )

  val screenConfig6: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 20,
        padding = 100,
        theme = "dark"
      )

  val screenConfig7: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 12,
        padding = 100,
        theme = "auto"
      )

  val screenConfig8: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 16,
        padding = 100,
        theme = "auto"
      )

  val screenConfig9: ScreenConfig = ScreenConfig(
        fontFamily = "system",
        fontSize = 20,
        padding = 100,
        theme = "auto"
      )

  fun getAllCombinations(): List<ScreenConfig> = listOf(
    screenConfig1,
    screenConfig2,
    screenConfig3,
    screenConfig4,
    screenConfig5,
    screenConfig6,
    screenConfig7,
    screenConfig8,
    screenConfig9
  )
}
```
**3. Now you can grab individual classes or all of them inside a list

## TO-DO / Future Enhancements

- [ ] **Limit Number of Generated Instances:**
  Implement an option to limit the maximum number of combinations generated (via an argument in `@Kombine`). This would be useful for very large combination sets.
- [ ] **Nullable Type Support:**
  Provide a clear way for users to explicitly include `null` as one of the possible values to be combined for a nullable property, alongside other non-null values, when using `@Kombine`.
- [ ] **Limit enums to be used for generation:**
    Right now all enum instances are used. There should be a way to only use a subset of them







