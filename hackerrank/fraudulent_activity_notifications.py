from bisect import bisect_left, insort_left

# Complete the activityNotifications function below.
def activityNotifications(expenditure, d):
    prior_transactions = sorted(expenditure[:d])

    notifications = 0
    for i in range(d, len(expenditure)):
        if d % 2 == 1:
            median = prior_transactions[d // 2]
        else:
            median = (prior_transactions[d // 2] + prior_transactions[d // 2 - 1]) / 2

        if expenditure[i] >= 2 * median:
             notifications += 1

        del prior_transactions[bisect_left(prior_transactions, expenditure[i - d])]

        insort_left(prior_transactions, expenditure[i])

    return notifications