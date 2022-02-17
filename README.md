[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![Apache License 2.0][license-shield]][license-url]



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/Insprill/EZ-Encrypt">
    <img src="https://imgur.com/BvJ2zvM.png" alt="Logo" width="128" height="128">
  </a>
</p>
<h2 align="center">EZ-Encrypt</h2>
<p align="center">
  A light-weight library for easily encrypting data in Java.
  <br />
  <a href="https://insprill.net/javadocs/ezencrypt"><strong>View Javadocs »</strong></a>
  <br />
  <br />
  <a href="https://github.com/Insprill/EZ-Encrypt/issues">Report Bugs</a>
  ·
  <a href="https://github.com/Insprill/EZ-Encrypt/issues">Request Features</a>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
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
#### Gradle
```groovy
dependencies {
    implementation 'net.insprill:EZ-Encrypt:version'
    // or
    implementation group: 'net.insprill', name: 'EZ-Encrypt', version: 'version'
}
```

### Compiling

To compile EZ-Encrypt, you need JDK 8 or higher and an internet connection.  
First, clone this repo, with `git clone https://github.com/Insprill/EZ-Encrypt.git`.  
Then run `./gradlew build` from your terminal.  
You can find the compiled jar in the `build/libs` directory.  
If you want the compiled jar published to your local Maven repo, run `./gradlew publishToMavenLocal`.



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Make your changes.
4. Stage your changes (`git add .`)
5. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
6. Push to the Branch (`git push origin feature/AmazingFeature`)
7. Open a Pull Request



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
