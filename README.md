# SeRoNet-Tooling-ROS-Mixed-Port

<a id="top"/> 

[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)

This repository holds the implementation of the ROS-SeRoNet Mixed Port component within the SeRoNet Tooling, its eclipse facilities, and realted examples. 

The SeRoNet Tooling is developed by the SeRoNet Project consortium: http://www.seronet-projekt.de

The ROS Mixed-Port Component is developed by:
* Service Robotics Research Center of Ulm University of Applied Sciences
* Fraunhofer Institute for Manufacturing Engineering and Automation IPA

**CAUTION: This software is a preview for the purpose of technology demonstration. It is experimental and comes with no support. Use at your own risk.**


The implemenentation of the ROS-SeRoNet Mixed-Port component is realized in two Domain-Specific Languages (DSLs).

- **RosInterfacesPool**: This is a stand-alone DSL that defines a pool of ROS interface specifications that is used by the next DSL to select the ROS-related communication interfaces of a SeRoNet Mixed-Port component.
- **RosPortExtension**: This DSL directly links the SeRoNet ComponentDefinition model with selected ROS communication port definitions from the above RosInterfacesPool DSL. This DSL is not stand-alone, but requires the ComponentDefinition DSL that is provided (among others) here: https://github.com/Servicerobotics-Ulm/SmartMDSD-Toolchain

- Example for **RosInterfacesPool** DSL can be found here: example/joy.rosinterfacespool
- Example for **RosPortExtension** DSL can be found here: ROS-MixedPort-Examples/ComponentRosJoystick/model/ComponentRosJoystick.componentRosPorts

Technical Maintainer: [**ipa-nhg**](https://github.com/ipa-nhg/) (**Nadia Hammoudeh Garcia**, **Fraunhofer IPA**) and [**alex-lotz**](https://github.com/alex-lotz) (**Alex Lotz**, **Hochschule Ulm**)

The Eclipse plugins in this repository are part of the SeRoNet Tooling and are not supposed to be used stand-alone. A full installer for the SeRoNet Tooling is going to be released in soon.
* A tutorial how to use the Mixed-Port-Component can be found here: [Development of a Mixed-Port-Component](https://wiki.servicerobotik-ulm.de/tutorials:ros:mixed-port-component-ros) and [System Composition using Mixed-Port Components](https://wiki.servicerobotik-ulm.de/tutorials:ros:running-a-system)

*Parts of this work has been created in research and development projects funded within the scope of the “PAiCE Digitale Technologien für die Wirtschaft” technology programme run by the Federal Ministry for Economic Affairs and Energy in Germany and is managed by the DLR project management agency „Gesellschaft, Innovation, Technologie - Informationstechnologien/Elektromobilität“ at the German Aerospace Center in Cologne. The authors of this work are solely responsible for the content of this work.*

<a href="#top">top</a>


