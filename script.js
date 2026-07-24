// Navbar shadow on scroll
window.addEventListener("scroll", function () {

    const nav = document.querySelector("nav");

    if (window.scrollY > 50) {
        nav.style.boxShadow = "0 4px 15px rgba(0,0,0,0.2)";
    } else {
        nav.style.boxShadow = "none";
    }

});

// Contact Form

const form = document.querySelector("form");

form.addEventListener("submit", function () {

    alert("Thank you! Your message is being sent.");

});

// Reveal animation

const cards = document.querySelectorAll(".card");

const observer = new IntersectionObserver((entries) => {

    entries.forEach(entry => {

        if (entry.isIntersecting) {

            entry.target.style.opacity = "1";
            entry.target.style.transform = "translateY(0)";

        }

    });

});

cards.forEach(card => {

    card.style.opacity = "0";
    card.style.transform = "translateY(40px)";
    card.style.transition = "0.8s";

    observer.observe(card);

});