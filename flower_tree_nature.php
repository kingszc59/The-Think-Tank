<?php 
// The Think Tank

//We create an array to store the data
$thinkTank = array();

//The function to add information to the Think Tank
function addToThinkTank($data){
	global $thinkTank;
	$thinkTank[] = $data;
}

//The function to get information from the Think Tank
function getFromThinkTank($index){
	global $thinkTank;
	if(isset($thinkTank[$index])){
		return $thinkTank[$index];
	}
	else {
		return null;
	}

}

//The function to remove information from the Think Tank
function removeFromThinkTank($index){
	global $thinkTank;
	if(isset($thinkTank[$index])){
		unset($thinkTank[$index]);
		return true;
	}
	else {
		return false;
	}
}

//The function to update information in the Think Tank
function updateThinkTank($index, $data){
	global $thinkTank;
	if(isset($thinkTank[$index])){
		$thinkTank[$index] = $data;
		return true;
	}
	else {
		return false;
	}
}

//The function to search the Think Tank
function searchThinkTank($data){
	global $thinkTank;

	$results = array();
	foreach ($thinkTank as $key => $value) { 
		if(strpos($value, $data) !== false){
			$results[] = $key;
		}
	}

	return $results;
}

//The function to display the contents of the Think Tank
function displayThinkTank(){
	global $thinkTank;
	
	echo '<pre>';
	foreach($thinkTank as $key => $data){
		echo $key . ' => ' . $data . "\n";
	}
	echo '</pre>';
}

//We add some test data
addToThinkTank('This is some test data');
addToThinkTank('This is some more test data');

//We display the array
displayThinkTank();

//We update the second element
updateThinkTank(1, 'This is an updated element');

//We display the array
displayThinkTank();

//We search for the term "test"
$results = searchThinkTank('test');
print_r($results);

?>