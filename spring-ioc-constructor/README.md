# Spring IOC Constructor

ApplicationContext
- This the most powerful Container, compare to Bean-factory (Core container).

ConfigurableApplicationContext
- One of the implementation of the ApplicationContext container. This container is used for Event Handling propose.
- If you implement the following methods and your Bean Class extends the ApplicationListener interface, then when these methods are executed, your Bean will get related Events.

    - void refresh()
    - void close()
    - void shutdown()