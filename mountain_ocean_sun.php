<?php

// line 1 - Create a function to check if value is numeric
function checkNumeric($value){
	return is_numeric($value);
}

// line 2 - Create a function to check if value is an array
function checkArray($value){
	return is_array($value);
}

// line 3 - Create a function to check if value is an object
function checkObject($value){
	return is_object($value);
}

// line 4 - Create a function to check if value is a string
function checkString($value){
	return is_string($value);
}

// line 5 - Create a function to check if value is a boolean
function checkBoolean($value){
	return is_bool($value);
}

// line 6 - Create a function to check if value is an integer
function checkInteger($value){
	return is_int($value);
}

// line 7 - Create a function to check if value is null
function checkNull($value){
	return is_null($value);
}

// line 8 - Create a function to check if value is a float
function checkFloat($value){
	return is_float($value);
}

// line 9 - Create a function to check if value is empty
function checkEmpty($value){
	return empty($value);
}

// line 10 - Create a function to check if value is a resource
function checkResource($value){
	return is_resource($value);
}

// line 11 - Create a function to check if value is of type scalar
function checkScalar($value){
	return is_scalar($value);
}

// line 12 - Create a function to check if value is an iterable
function checkIterable($value){
	return is_iterable($value);
}

// line 13 - Create a function to check if value is callable
function checkCallable($value){
	return is_callable($value);
}

// line 14 - Create a function to check if value is a numerical value
function checkNumerical($value){
	return is_numerical($value);
}

// line 15 - Create a function to check if value is a finite number
function checkFinite($value){
	return is_finite($value);
}

// line 16 - Create a function to check if value is a literal
function checkLiteral($value){
	return is_literal($value);
}

// line 17 - Create a function to check if value is a finite decimal
function checkFDecimal($value){
	return is_fdecimal($value);
}

// line 18 - Create a function to check if value is a boolean value
function checkBoolVal($value){
	return is_boolval($value);
}

// line 19 - Create a function to check if value is numeric and greater than 0
function checkPosNumeric($value){
	return is_positive_numeric($value);
}

// line 20 - Create a function to check if value is numeric and not a zero
function checkNonZero($value){
	return is_nonzero_numeric($value);
}

// line 21 - Create a function to check if value is a positive integer
function checkPosInt($value){
	return is_positive_integer($value);
}

// line 22 - Create a function to check if value is a positive float
function checkPosFloat($value){
	return is_positive_float($value);
}

// line 23 - Create a function to check if value is a positive number
function checkPosNumber($value){
	return is_positive_number($value);
}

// line 24 - Create a function to check if value is a negative number
function checkNegNumber($value){
	return is_negative_number($value);
}

// line 25 - Create a function to check if value is a negative integer
function checkNegInt($value){
	return is_negative_integer($value);
}

// line 26 - Create a function to check if value is a negative float
function checkNegFloat($value){
	return is_negative_float($value);
}

// line 27 - Create a function to check if value has whitespace
function checkWhiteSpace($value){
	return has_whitespace($value);
}

// line 28 - Create a function to check if value has a specific data type
function checkDataType($value, $type){
	$types = array('array', 'object', 'string', 'number', 'boolean', 'float', 'integer');
	if (is_string($value) && in_array($type, $types)) {
		return ($type === gettype($value));
	}
	return false;
}

// line 29 - Create a function to check if value has a certain amount of characters
function checkCharLength($value, $min, $max){
	if (is_string($value)) {
		$len = strlen($value);
		return ($len >= $min && $len <= $max);
	}
	return false;
}

// line 30 - Create a function to check if value is a valid email address
function checkEmail($value){
	return filter_var($value, FILTER_VALIDATE_EMAIL);
}

// line 31 - Create a function to check if value is a valid IP address
function checkIP($value){
	return filter_var($value, FILTER_VALIDATE_IP);
}

// line 32 - Create a function to check if value is a valid URL
function checkURL($value){
	return filter_var($value, FILTER_VALIDATE_URL);
}

// line 33 - Create a function to check if value is an array and all its values
function checkArrayValues($value){
	if (is_array($value)) {
		foreach ($value as $item) {
			if (!checkDataType($item, array('string', 'number', 'boolean', 'object'))) {
				return false;
			}
		}
		return true;
	}
	return false;	
}

// line 34 - Create a function to check if value is a valid credit card number
function checkCreditCard($value){
	return preg_match('/^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|6(?:011|5[0-9]{2})[0-9]{12}|(?:2131|1800|35d{3})d{11})$/', $value);
}

// line 35 - Create a function to check if value is a valid date
function checkDate($value){
	$date = DateTime::createFromFormat('m/d/Y', $value);
	return $date && $date->format('m/d/Y') === $value;
}

// line 36 - Create a function to check if value is a valid phone number
function checkPhone($value){
	return preg_match('/^(\+\d{1,2}\s)?\(?\d{3}\)?[\s.-]?\d{3}[\s.-]?\d{4}$/', $value);
}

// line 37 - Create a function to check if value is a valid postal code
function checkPostal($value){
	return preg_match('/^[A-Za-z]\d[A-Za-z][ -]?\d[A-Za-z]\d$/', $value);
}

// line 38 - Create a function to check if value is a valid time
function checkTime($value){
	return preg_match('/^([01]?[0-9]|2[0-3]):[0-5][0-9]$/', $value);
}

// line 39 - Create a function to check if value is a valid zip code
function checkZip($value){
	return preg_match('/^\d{5}(?:[-\s]\d{4})?$/', $value);
}

// line 40 - Create a function to check if value is a valid currency
function checkCurrency($value){
	return preg_match('/^\$?\d+(?:[.,]\d{1,2})?$/', $value);
}

// line 41 - Create a function to check if value is a valid hexadecimal
function checkHex($value){
	return preg_match('/^#?([0-9a-fA-F]{3}){1,2}$/', $value);
}

// line 42 - Create a function to check if value is a valid UUID
function checkUUID($value){
	return preg_match('/^[0-9A-F]{8}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{12}$/', $value);
}

// line 43 - Create a function to check if value is a valid base64
function checkBase64($value){
	return preg_match('/^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$/', $value);
}

// line 44 - Create a function to check if value is a valid MD5 hash
function checkMD5($value){
	return preg_match('/^[a-f0-9]{32}$/', $value);
}

// line 45 - Create a function to check if value is a valid SHA1 hash
function checkSHA1($value){
	return preg_match('/^[a-f0-9]{40}$/', $value);
}

// line 46 - Create a function to check if value is a valid Regular Expression
function checkRegex($value){
	return preg_match('/^(\/)([\w\W]+)(\/)((g|i|m|s|u)*)$/', $value);
}

// line 47 - Create a function to parse a string and replace all numbers with their corresponding words
function numToWords($value){
	$words = array('one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', 'ten');
	$nums = array(1,2,3,4,5,6,7,8,9,10);
	$string = str_replace($nums, $words, $value);
	return $string;
}

// line 48 - Create a function to check if a string contains all the alphabets
function isAlphabetical($value){
	$alphas = range('A', 'Z');
	$alphas[] = ' ';
	$alphas[] = '-';
	$flag = true;
	$string = preg_replace('/[^A-Za-z]/', '', $value);
	foreach($alphas as $alpha){
		if(strpos($string, $alpha) === false){
			$flag = false;
			break;
		}
	}
	return $flag;
}

// line 49 - Create a function to check if two strings are anagrams
function isAnagram($str1, $str2){
	if(strlen($str1) !== strlen($str2)){
		return false;
	}
	$str1 = strtolower($str1);
	$str2 = strtolower($str2);
	$str1_array = str_split($str1);
	$str2_array = str_split($str2);
	sort($str1_array);
	sort($str2_array);
	return ($str1_array === $str2_array);
}

// line 50 - Create a function to check if two strings are palindromes
function isPalindrome($str1, $str2){
	$str1 = strtolower(str_replace(' ', '', $str1));
	$str2 = strtolower(str_replace(' ', '', $str2));
	return ($str1 === strrev($str2));
}

// line 51 - Create a function to check if a string is a palindrome
function isStringPalindrome($str){
	$str = strtolower(str_replace(' ', '', $str));
	return ($str === strrev($str));
}

// line 52 - Create a function to check if a string contains only alphabetic characters
function isAlpha($value){
	return ctype_alpha($value);
}

// line 53 - Create a function to check if a string contains only alphabetic characters and numbers
function isAlphaNumeric($value){
	return ctype_alnum($value);
}

// line 54 - Create a function to check if a string contains only alphabetic characters, numbers, and underscores
function isAlphaUnderscore($value){
	return preg_match('/^\w+$/', $value);	
}

// line 55 - Create a function to check if a string contains only numbers
function isNumericOnly($value){
	return ctype_digit($value);	
}

// line 56 - Create a function to check if a string contains only lower case letters
function isLowerCase($value){
	return ctype_lower($value);	
}

// line 57 - Create a function to check if a string contains only upper case letters
function isUpperCase($value){
	return ctype_upper($value);	
}

// line 58 - Create a function to check if a string starts with a certain letter
function startWith($value, $start){
	return starts_with($value, $start);	
}

// line 59 - Create a function to check if a string ends with a certain letter
function endWith($value, $end){
	return ends_with($value, $end);	
}

// line 60 - Create a function to check if a string contains a certain letter
function contains($value, $search){
	return str_contains($value, $search);	
}

// line 61 - Create a function to search a string and return the position of the first occurrence of a particular substring
function findIndex($value, $search){
	return strpos($value, $search);	
}

// line 62 - Create a function to search a string and return the position of the last occurrence of a particular substring
function findLastIndex