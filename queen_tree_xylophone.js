// The Think Tank

// File #1

// Global Variables
var MIN_SIZE = 2;
var MAX_SIZE = 10;
var MAX_CAPACITY = 50;
var MAX_AGE = 100;

// Helper Functions
function randomSize() {
    return Math.floor(Math.random() * (MAX_SIZE - MIN_SIZE + 1)) + MIN_SIZE;
}

function randomAge() {
    return Math.floor(Math.random() * MAX_AGE) + 1;
}

// Class Constructors
function Tank(size, capacity, age) {
	this.size = size;
	this.capacity = capacity;
	this.age = age;
	this.isFull = false;
	
	this.fill = function() {
		this.isFull = true;
	}
	
	this.empty = function() {
		this.isFull = false;
	}
}

// Instances

// Create a tank with random size, capacity and age
var myTank = new Tank(randomSize(), MAX_CAPACITY, randomAge());

// Create a tank with specific size, capacity and age
var yourTank = new Tank(4, 30, 5);

// Methods

// Function to calculate the volume of a tank
function getVolume(tank) {
	return tank.size * tank.size * tank.capacity;
}

// Function to print the properties of a tank
function printTank(tank) {
	console.log('Size: ' + tank.size);
	console.log('Capacity: ' + tank.capacity);
	console.log('Age: ' + tank.age);
	console.log('Is full: ' + tank.isFull);
	console.log('Volume: ' + getVolume(tank) + '\n');
}

// Main
console.log('My tank: ');
printTank(myTank);
console.log('Your tank: ');
printTank(yourTank);

// Fill my tank
myTank.fill();
console.log('Filling my tank...');
printTank(myTank);

// Empty your tank
yourTank.empty();
console.log('Emptying your tank...');
printTank(yourTank);