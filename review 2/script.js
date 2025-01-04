// Handle Login form submission
document.getElementById('loginModal').addEventListener('submit', function (e) {
    e.preventDefault(); // Prevent form from submitting the default way

    const email = document.getElementById('loginEmail').value;
    const password = document.getElementById('loginPassword').value;

    // Simple validation check
    if (email === '' || password === '') {
        alert('Please fill in both fields.');
        return;
    }

    // Simulate login (you can replace this with actual authentication logic)
    console.log('Logging in with', email, password);

    // Close modal after submission
    const modal = new bootstrap.Modal(document.getElementById('loginModal'));
    modal.hide();
    alert('Login Successful!');
});

// Handle Sign Up form submission
document.getElementById('signupModal').addEventListener('submit', function (e) {
    e.preventDefault(); // Prevent form from submitting the default way

    const email = document.getElementById('signupEmail').value;
    const password = document.getElementById('signupPassword').value;
    const confirmPassword = document.getElementById('signupConfirmPassword').value;

    // Simple validation check
    if (email === '' || password === '' || confirmPassword === '') {
        alert('Please fill in all fields.');
        return;
    }

    if (password !== confirmPassword) {
        alert('Passwords do not match.');
        return;
    }

    // Simulate sign-up (you can replace this with actual user creation logic)
    console.log('Signing up with', email, password);

    // Close modal after submission
    const modal = new bootstrap.Modal(document.getElementById('signupModal'));
    modal.hide();
    alert('Sign Up Successful!');
});

// Optionally, you can add some more dynamic behavior here, such as checking email format, password strength, etc.
