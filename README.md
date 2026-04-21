Marrius Williams
SNHU CS-320

Professional Reflection
To ensure software is function and secure, I implement a defense in depth testing strategy. During my ork with JUnit, I dfocused on BVA to ensure that inputs were strictly validates agaisnt length and null requirements. By writing test that specifically attempt to break the system, such as inputting a 51 character string when the limit is 50. This ensures that the program remains secure againt buffer overflows and data corruption. Function correctness is maintained by reaching high code coverage, ensuring that every conditrional branch and logic path is verified before the code moves to production.

Interpretating and incorporating User Needs.
Interpratating user needs involves translating high-level business requirements into technical contraints. For example if a user requires that a contect record must be unique and identifiable, I incorporate that by designing a "Tast Service" that enforces invariant rules (like non updatable ids). I use these requirements to drive my Test Driven Development process, where the test case defines what success looks like based on the users criteria. This ensures that the final product isn't just a bug free one, but actually does what the customer wants.

The approach to Software Design
My approach to design is centered on Modularity and Maintainability. I design software so that the "Business Logic" is seprate from the "Data Storage," making it alot easier to test components in isolation. By using the Singleton Pattern or Service Layers, i ensure that my software is scalable. I approach every project with the goal of creating "Self- Documenting Code" where clear naming conventions and structured unit test act as a guide for futrue developers, reducing technical debt and making the software easier to evolve over time.
