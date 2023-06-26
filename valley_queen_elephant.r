#This code will generate 2000 random data points, assign each to a list, then plot the data points on a graph

#Set the R seed for reproducible results
set.seed(2)

#Generate 2000 random data points
list1 <- runif(2000, min=0, max=10)
list2 <- runif(2000, min=0, max=10)

#Plot the data points and label
plot(list1, list2, main="Random Data Points",
     xlab="list1", ylab="list2", pch='.', cex=0.5)

#Calculate the mean of the data points
meanL1 <- mean(list1)
meanL2 <- mean(list2)

#Plot the means on the graph
points(meanL1, meanL2, col="red", pch=19, cex=1.5)

#Calculate the variance of the data points
varianceL1 <- var(list1)
varianceL2 <- var(list2)

#Add a legend to the graph
legend("topleft", c("mean L1","mean L2", "variance L1", "variance L2"),
       col=c("red", "red", "black", "black"), lty=c(1,1,NA,NA), pch=c(19,19,NA,NA))

#Calculate the correlation coefficient
correlCoef <- cor(list1, list2)

#Add the correlation coefficient to the graph
text(6.5, 8, paste("correlation coefficient =", correlCoef))

#Save the graph as a .png file
png(filename = "TheThinkTank_plot.png")
plot(list1, list2, main="Random Data Points",
     xlab="list1", ylab="list2", pch='.', cex=0.5)
points(meanL1, meanL2, col="red", pch=19, cex=1.5)
legend("topleft", c("mean L1","mean L2", "variance L1", "variance L2"),
       col=c("red", "red", "black", "black"), 
       lty=c(1,1,NA,NA), pch=c(19,19,NA,NA))
text(6.5, 8, paste("correlation coefficient =", correlCoef))
dev.off()