[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![GPLv3 License][license-shield]][license-url]



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/Insprill/EZ-Encrypt">
    <img src="https://imgur.com/BvJ2zvM.png" alt="Logo" width="128" height="128">
  </a>
<h2 align="center">EZ-Encrypt</h2>

  <p align="center">
    EZ-Encrypt is a simple library for easily encrypting data.
    <br />
    <a href="https://insprill.net/javadocs/ezencrypt"><strong>View Javadocs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/Insprill/EZ-Encrypt">View Demo</a>
    ·
    <a href="https://github.com/Insprill/EZ-Encrypt/issues">Report Bugs</a>
    ·
    <a href="https://github.com/Insprill/EZ-Encrypt/issues">Request Features</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#compiling">Compiling</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

EZ-Encrypt was developed as an easy way to securely encrypt data without having to write all the overhead yourself.


<!-- USAGE EXAMPLES -->
## Usage

### Implementing in your project
[![Release](https://jitpack.io/v/Insprill/EZ-Encrypt.svg)](https://jitpack.io/#Insprill/EZ-Encrypt)
#### Maven
```xml
    <repository>
	<id>jitpack.io</id>
	<url>https://jitpack.io</url>
    </repository>
```
```xml
    <dependency>
        <groupId>net.nsprill</groupId>
        <artifactId>EZ-Encrypt</artifactId>
        <version>version</version>
        <scope>provided</scope>
    </dependency>
```
#### Gradle
```groovy
repositories {
    maven { url = 'https://jitpack.io' }
}
```
```groovy
dependencies {
    implementation group: 'net.insprill', name: 'EZ-Encrypt', version: 'version'
    // or
    implementation 'net.insprill:EZ-Encrypt:version'
}
```

### Compiling

To compile EZ-Encrypt, you need JDK 8 or higher and an internet connection.  
First, clone this repo, with `git clone https://github.com/Insprill/EZ-Encrypt.git`.  
Then run `./gradlew build` from your terminal.  
You can find the compiled jar in the `build/libs` directory.  
If you want the compiled jar published to your local Maven repo, run `./gradlew publishToMavenLocal`.



<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/Insprill/EZ-Encrypt/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the GNU GPLv3 License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Twitter - [@InsprillO_O](https://twitter.com/InsprillO_O)

Discord - [https://discord.gg/ZW4dvfr](https://discord.gg/SH7VyYtuC2)

Project Link: [https://github.com/Insprill/EZ-Encrypt](https://github.com/Insprill/EZ-Encrypt)





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
[license-url]: https://github.com/Insprill/EZ-Encrypt/blob/master/LICENSE.txt
