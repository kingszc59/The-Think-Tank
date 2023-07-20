extern crate rand;

use std::fmt;
use std::io;
use std::cmp::Ordering;
use rand::Rng;

fn main() {
    println!("Welcome to The Think Tank!");

    let secret_number = rand::thread_rng().gen_range(1, 101);

    println!("Please input your guess.");

    loop {
        let mut guess = String::new();

        io::stdin()
            .read_line(&mut guess)
            .expect("Failed to read line");

        let guess: u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        println!("You guessed: {}", guess);

        match guess.cmp(&secret_number) {
            Ordering::Less => println!("The secret number is greater than {}", guess),
            Ordering::Greater => println!("The secret number is less than {}", guess),
            Ordering::Equal => {
                println!("You guessed correctly! Congratulations!");
                break;
            }
        }
    }

    #[derive(Debug)]
    struct ThinkTank {
        guess_number: u32,
        secret_number: u32,
    }

    impl fmt::Display for ThinkTank {
        fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
            write!(f, 
                "You guessed: {}\nThe secret number is {}",
                self.guess_number, self.secret_number
            )
        }
    }

    let think_tank = ThinkTank {
        guess_number: secret_number,
        secret_number: secret_number,
    };

    println!("{}", think_tank);
}