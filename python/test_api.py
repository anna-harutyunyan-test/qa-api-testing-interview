import requests

BASE_URL = "https://jsonplaceholder.typicode.com"

def test_get_users_should_return_200():
    """Verify that fetching users returns a 200 OK and populated array."""
    response = requests.get(f"{BASE_URL}/users")
    assert response.status_code == 200
    assert len(response.json()) > 0
    
    # Check that key fields exist in the first user
    first_user = response.json()[0]
    assert "name" in first_user
    assert "email" in first_user

def test_create_user_should_return_201():
    """
    TODO: Candidate Assignment
    Write a test to POST a new user to /users.
    Verify status code is 201 Created and that the returned object contains your payload details.
    """
    pass

def test_get_non_existent_user_should_return_404():
    """
    TODO: Candidate Assignment
    Write a negative test requesting /users/9999.
    Verify the API handles this with a 404 Not Found response.
    """
    pass
