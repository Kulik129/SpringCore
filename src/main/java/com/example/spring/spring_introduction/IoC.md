#### *Inversion of Control* - это аутсорсинг создания и управления объектами. Т.е. передача программистом прав на создание и управление объектами Spring-у.
#### _`Это когда кто-то другой создает и управляет объектами вместо программиста`_

--- 

#### *Dependency Injection* - это аутсорсинг добавления/внедрения зависимостей. DI делает объекты нашего приложения слабо зависимыми друг от друга.

```xml
<bean id="myPet"
          class="com.example.spring.spring_introduction.Cat">
    </bean>

<!--  внедрение зависимости с помощью конструктора, описали зависимость одного бина от другого-->
    <bean id="myPerson"
          class="com.example.spring.spring_introduction.Person">
        <constructor-arg ref="myPet"></constructor-arg>
    </bean>

<!--    Внедрение зависимости с помощью сеттера-->
    <bean id="myPerson"
          class="com.example.spring.spring_introduction.Person">
        <property name="pet" ref="myPet"></property>

        <property name="surname" value="${person.surname}"></property>
        <property name="age" value="${person.age}"></property>
    </bean>

```
--- 

Это мы делаем DI а весь остальной код это IoC 
```xml
<property name="pet" ref="myPet"></property> 
```