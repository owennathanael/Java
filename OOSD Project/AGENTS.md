# Theater Booking System

Java Swing desktop application with MySQL database backend.

## Build & Run

```bash
cd theater
javac -cp "lib/mysql-connector-j-9.6.0.jar" src/main/java/*.java
java -cp "lib/mysql-connector-j-9.6.0.jar:src/main/java" MainMenu
```

## Database

- **Host**: `localhost:3306/theater`
- **Credentials**: `root` / `root` (CreateNewAcc.java) or `username`/`password` (CRUD classes - appears incomplete)
- **Schema**: See `Tables.sql` in repo root
- Run schema before first run: `mysql -u root -p < /mnt/c/OOSD\ Project/Tables.sql`

## Entry Point

- **Actual entry**: `MainMenu.java` (not Main.java which has buggy duplicate instantiation)
- Main.java creates multiple MainMenu instances and sets wrong size - use MainMenu directly

## Architecture

- `MainMenu.java`: Login UI and authentication
- `CreateNewAcc.java`: New user registration
- `verifier.java` + `LoginWrongInfoException.java`: Login validation
- `*CRUD.java`: Database operations (User, Movie, Screening, Seat, Ticket, Purchase, Review)
- MySQL connector: `lib/mysql-connector-j-9.6.0.jar`

## Known Issues

- Database credentials are inconsistent across files (hardcoded differently)
- Main.java has multiple instantiation bugs - run MainMenu directly
- Code has inconsistent spacing (e.g., `java .awt` instead of `java.awt`)
- CRUD update methods don't execute the prepared statements
