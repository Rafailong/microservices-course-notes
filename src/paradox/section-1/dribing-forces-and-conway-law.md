# Driving forces and Conway's Law

## Driving forces

**DevOps**: unify software development and software operation.
Removing any existing silos between dev team and any other teams
i.e. QA, Ops. Continious Integrations, Continious Delivery,
Infrastructure as Code, Monitoring and Logging.

**Polyglot persistence**: using diff data storage technologies
i.e. SQL, NoSQL, Key-Value. Important point to keep in mind are:

- Access pattern
- Transactional semantics
- Durability, and
- Availability

**Cloud providers (public)**: Benefits like economy of scale, elasticity, security between other.

**Serverles computing**: dynamically managed allocation of machine resources.
Pricing is based on the actual amount of resources consumed by an application.
Still requires servers but developers are not require to manage these resources.

## Conway's Law

Also, we can improve an organization communication mechanisms (Conway's Law [(3)](https://medium.com/@Alibaba_Cloud/conways-law-a-theoretical-basis-for-the-microservice-architecture-c666f7fcc66a)):

"Any organization that designs a system (defined broadly)
will produce a design whose structure is a copy of the organization's communication structure."

Teams in the organization will be able to work independently reducing communication overhead.

![conway law](../../assets/images/section-1-image-2.jpg)