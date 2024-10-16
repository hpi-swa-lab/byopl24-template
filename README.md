# BYOPL 24 -- Lox Truffle Implementation 

The Lox implementation is developed as part of the Build Your Own Programming Language course at Software Architecture Group, Hasso Plattner Institute, Potsdam. 

## Getting Started 

See Getting Started section in [BYOPL-2024_Overview](https://1drv.ms/b/s!AosvRVbmrjPTm_YQOBq8GXW3BYNq5A?e=EaAI5S).

## Maven

To directly use the command line, this might be helpful:


### Compile ...

```bash
mvn package
```

### Run Test

```bash
mvn test -Dtest=PrintTest
```


### Running: 

```bash
mvn exec:java -Dexec.args="-c 'print true;'"
```

### Cleanup

```bash
mvn clean
```
