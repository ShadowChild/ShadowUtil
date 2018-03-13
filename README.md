# ShadowUtil

# Usage
As I currently do not have a maven repo, you will have to install in your local maven,

I have already done the hard work for you with this and all you have to do is download this repo and run

`gradlew`

This will build the project and install it in to your local maven, you can then add it as a dependency in your project by using the following:

```
repositories {

    mavenLocal()
}

dependencies {

    compile "io.github.shadowchild.util:ShadowUtil:{mc_version}-{mod_version}"
}
```

where {mc_version} is replaced with the Minecraft Version (for instance 1.12.2)

and {mod_version} is replaced with the Mod Version (For instance 1.0)