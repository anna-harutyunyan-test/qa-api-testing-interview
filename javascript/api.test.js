const axios = require('axios');

const BASE_URL = 'https://jsonplaceholder.typicode.com';

test('GET /users - should return 200 OK and user list', async () => {
  const response = await axios.get(`${BASE_URL}/users`);
  expect(response.status).toBe(200);
  expect(response.data.length).toBeGreaterThan(0);
  
  const firstUser = response.data[0];
  expect(firstUser).toHaveProperty('name');
  expect(firstUser).toHaveProperty('email');
});

test('POST /users - should return 201 Created', async () => {
  // TODO: Candidate Assignment
  // Write a test to POST a new user to /users.
  // Verify response is 201 and fields match.
});

test('GET /users/9999 - should return 404 Not Found', async () => {
  // TODO: Candidate Assignment
  // Write a negative test requesting /users/9999.
  // Verify response status is 404.
});
