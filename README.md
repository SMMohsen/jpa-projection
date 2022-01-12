JPA Projection can be done through multiple ways 

1 - throgh overload entity 

you can build multiple entity classes on top of same table and you can use it with relations or with seperate repositories

2 - through interfaces 

you can create interfaces that have getters of entity fields and use it in repositortyies , this way has limitation when interface has non primitive type
projection will not refletced to SELECT statement instead will query all fields then map only fields found in interface as per this 

https://stackoverflow.com/questions/61735782/hibernate-generating-unnecessary-queries-when-using-nested-closed-jpa-projection

3 - through class 

you can create class with required fields only that match entity field names and constructor here is required to avoid runtime exceptions , but this method has limitation
that you can not have relatetions mapping in the class because this way works as fire SELECT statement get result then call class constructor and bind values at
and at this time relations values not came yet

4 - dynamic projection like this 

<T> T findByIdIs(Long id, Class<T> type);

