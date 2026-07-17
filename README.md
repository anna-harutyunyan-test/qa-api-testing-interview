# QA API Automation Interview Sandbox

Welcome to your practical interview challenge! In this workspace, you will write a couple of functional API tests against a real Mock REST API.

We have configured templates for three languages. **Pick the one you are most comfortable with:**

*   **Python** (using `pytest` & `requests`)
*   **JavaScript** (using `jest` & `axios`)
*   **Java** (using `JUnit 5` & `REST Assured`)

---

## 🎯 The Assignment

Your target API is: **`https://jsonplaceholder.typicode.com`**

You will find a test file preconfigured for your chosen language with one passing placeholder test. Open your respective language folder:
*   Python: `/python/test_api.py`
*   JavaScript: `/javascript/api.test.js`
*   Java: `/java/src/test/java/ApiTest.java`

### Your Tasks:
1.  **Implement the POST Test (`test_create_user_should_return_201`)**:
    *   Send a `POST` request to `/users` with a JSON payload representing a new user (e.g., fields `name`, `username`, `email`).
    *   Verify that the response returns status code `201` (Created).
    *   Assert that the returned JSON echoes back the values you sent, including a newly assigned auto-incremented ID.
2.  **Implement the Negative Test (`test_get_non_existent_user_should_return_404`)**:
    *   Send a `GET` request to a non-existent resource: `/users/9999`.
    *   Assert that the API correctly returns a `404` (Not Found) status code.

---

## 🛠️ How to Run the Tests

You can execute your tests directly from the terminal by passing your chosen language argument to our utility script:

*   **For Python:** `./run.sh python`
*   **For JavaScript:** `./run.sh js`
*   **For Java:** `./run.sh java`
