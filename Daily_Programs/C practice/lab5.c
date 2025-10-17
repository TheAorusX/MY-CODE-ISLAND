#include <stdio.h>
int main()
{
    int n, i, j, k;
    int arr[100];
    int sum = 0, max, min, even = 0, odd = 0, temp;

    // --- 1D Array Operations ---
    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter %d numbers:\n", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nArray elements: ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    // Sum of elements
    for (i = 0; i < n; i++)
    {
        sum += arr[i];
    }
    printf("\nSum of elements: %d", sum);

    // Max and Min
    max = min = arr[0];
    for (i = 1; i < n; i++)
    {
        if (arr[i] > max)
            max = arr[i];
        if (arr[i] < min)
            min = arr[i];
    }
    printf("\nMaximum: %d", max);
    printf("\nMinimum: %d", min);

    // Count even and odd
    for (i = 0; i < n; i++)
    {
        if (arr[i] % 2 == 0)
            even++;
        else
            odd++;
    }
    printf("\nEven numbers: %d", even);
    printf("\nOdd numbers: %d", odd);

    // Sort in ascending order
    for (i = 0; i < n - 1; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    printf("\nSorted array (ascending): ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    // --- 2D Array (Matrix Multiplication) ---
    int a[10][10], b[10][10], c[10][10];
    int r1, c1, r2, c2;

    printf("\n\nEnter rows and cols for first matrix: ");
    scanf("%d%d", &r1, &c1);
    printf("Enter rows and cols for second matrix: ");
    scanf("%d%d", &r2, &c2);

    if (c1 != r2)
    {
        printf("Matrix multiplication not possible.\n");
        return 0;
    }

    printf("Enter elements of first matrix:\n");
    for (i = 0; i < r1; i++)
        for (j = 0; j < c1; j++)
            scanf("%d", &a[i][j]);

    printf("Enter elements of second matrix:\n");
    for (i = 0; i < r2; i++)
        for (j = 0; j < c2; j++)
            scanf("%d", &b[i][j]);

    for (i = 0; i < r1; i++)
    {
        for (j = 0; j < c2; j++)
        {
            c[i][j] = 0;
            for (k = 0; k < c1; k++)
            {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    printf("\nResultant Matrix (Multiplication):\n");
    for (i = 0; i < r1; i++)
    {
        for (j = 0; j < c2; j++)
        {
            printf("%d ", c[i][j]);
        }
        printf("\n");
    }

    return 0;
}