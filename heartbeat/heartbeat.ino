unsigned long time;
int n=0;
void setup()
{
  Serial.begin(9600);
  
}

void loop()
{
  time = millis();
  
  // n+=1;
  Serial.println(time);
  delay(1000);
  
  
}

