# testcassandraandpostgres

# postgres
`CREATE TABLE citizen (
    id VARCHAR,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    phone VARCHAR,
    PRIMARY KEY (id)
);`

#cassandra
docker run -d --name cassandra -p 9042:9042 cassandra
docker exec -it cassandra bash
cqlsh
* create a keyspace called 'my-cassandra-test' using 'SimpleStrategy' class for data replication
`CREATE KEYSPACE my_cassandra_test WITH REPLICATION={'class': 'SimpleStrategy', 'replication_factor': 1};`
* list all existing keyspaces
`SELECT * FROM system_schema.keyspaces;`
* use the keyspace to create tables
`USE my_cassandra_test;`
* create table.
`CREATE TABLE citizen ( id VARCHAR,first_name VARCHAR, last_name VARCHAR, email VARCHAR, phone VARCHAR, PRIMARY KEY (id));`

