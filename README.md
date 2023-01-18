[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![Apache License 2.0][license-shield]][license-url]




<!-- PROJECT LOGO -->
<div align="center">
  <a href="https://github.com/Insprill/EZ-Encrypt">
    <img src="https://imgur.com/BvJ2zvM.png" alt="Logo" width="128" height="128">
  </a>
  <h1>EZ-Encrypt</h1>
  <p>
    A light-weight Java library that makes AES encryption simple.
    <br />
    <a href="https://javadoc.io/doc/net.insprill/EZ-Encrypt"><strong>View Javadocs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/Insprill/EZ-Encrypt/issues">Report Bug</a>
    ·
    <a href="https://github.com/Insprill/EZ-Encrypt/issues">Request Feature</a>
    <br />
    <br />
    <b>Notice:</b> 
    <br />
    EZ-Encrypt is now feature-complete. Bug fixes and maintenance will still be provided.
  </p>
</div>




<!-- TABLE OF CONTENTS -->
<details>
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#compiling">Compiling</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
  </ol>
</details>




<!-- ABOUT THE PROJECT -->
## About The Project

EZ-Encrypt was developed as an easy way to securely encrypt data without having to write all the overhead yourself.




<!-- USAGE EXAMPLES -->
## Usage

### Implementing in your project

[![Maven Central][maven-central-shield]][license-url]
#### Maven

```xml
<dependency>
    <groupId>net.nsprill</groupId>
    <artifactId>EZ-Encrypt</artifactId>
    <version>version</version>
</dependency>
```

#### Gradle (Groovy)

```groovy
dependencies {
    implementation 'net.insprill:EZ-Encrypt:version'
}
```

#### Gradle (Kotlin)

```groovy
dependencies {
    implementation("net.insprill:EZ-Encrypt:version")
}
```




<!-- COMPILING -->

### Compiling

To compile EZ-Encrypt, you need JDK 8 or higher and an internet connection.  
Clone this repo, then run `./gradlew build` from your terminal.  
You can find the compiled jar in the `build/libs` directory.  
If you want the compiled jar published to your local Maven repo, run `./gradlew publishToMavenLocal`.




<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create.  
Any contributions you make are **greatly appreciated**!  
If you're new to contributing to open-source projects, you can follow [this](https://docs.github.com/en/get-started/quickstart/contributing-to-projects) guide.




<!-- LICENSE -->
## License

Distributed under the Apache 2.0 License. See [`LICENSE`][license-url] for more information.




<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/Insprill/EZ-Encrypt.svg?style=for-the-badge
[contributors-url]: https://github.com/Insprill/EZ-Encrypt/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/Insprill/EZ-Encrypt.svg?style=for-the-badge
[forks-url]: https://github.com/Insprill/EZ-Encrypt/network/members
[stars-shield]: https://img.shields.io/github/stars/Insprill/EZ-Encrypt.svg?style=for-the-badge
[stars-url]: https://github.com/Insprill/EZ-Encrypt/stargazers
[issues-shield]: https://img.shields.io/github/issues/Insprill/EZ-Encrypt.svg?style=for-the-badge
[issues-url]: https://github.com/Insprill/EZ-Encrypt/issues
[license-shield]: https://img.shields.io/github/license/Insprill/EZ-Encrypt.svg?style=for-the-badge
[license-url]: https://github.com/Insprill/EZ-Encrypt/blob/master/LICENSE
[maven-central-shield]: https://img.shields.io/maven-central/v/net.insprill/EZ-Encrypt
[maven-central-url]: https://mvnrepository.com/artifact/net.insprill/EZ-Encrypt
