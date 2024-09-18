## Campaign Manager Backend - Quick Documentation

### Overview
This is the backend for the Campaign Manager application, built with **Spring Boot**. It manages users, campaigns, and their related data. The backend uses **JPA** for database operations and integrates with a relational database.

### Key Features
- Manage campaigns (create, update, delete).
- Associate campaigns with users.
- Manage user balances (Emerald Funds).
  
### Technologies
- **Spring Boot**: Java backend framework.
- **JPA (Jakarta Persistence API)**: ORM for data handling.
- **Maven**: Build and dependency management.
- **Database**: Uses H2 (or other relational DB).

### API Endpoints

#### Campaigns
- **GET /api/campaigns**: Fetch all campaigns.
- **POST /api/campaigns/{userId}**: Create a new campaign for the specified user.
- **PUT /api/campaigns/{id}**: Update an existing campaign.
- **DELETE /api/campaigns/{id}**: Delete a campaign.

#### Users
- **GET /api/users/{id}**: Fetch a user by ID.
- **PUT /api/users/{id}/update-balance**: Update a user's balance.

### Entity Relationships
- **User**: Has a list of campaigns.
- **Campaign**: Linked to a user (`ManyToOne` relationship).


### Error Handling
- **ResourceNotFoundException**: Thrown when a user or campaign is not found.
- **InsufficientFundsException**: Thrown when a user doesn't have enough funds for a campaign.

