#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef pair<int, int> pi;
typedef set<int> si;
typedef set<ll> sl;
typedef map<int, int> mi;
typedef map<char, int> mc;
#define lpr pair<long long int, long long int>

#define fast                      \
    ios_base::sync_with_stdio(0); \
    cout.tie(nullptr);            \
    cin.tie(nullptr);
#define input(gggg, n)             \
    for (int xd = 0; xd < n; xd++) \
        cin >> gggg[xd];
#define REP(i, a, b) for (int i = a; i < b; ++i)
#define REPP(i, a, b) for (int i = a; i >= b; --i)
#define F first
#define S second
#define PB push_back
#define MP make_pair
#define nl "\n"
#define sp " "

#define bg 1000000

vector<bool> is_prime(bg + 1, true);
vector<long long> is_prime_main;

void findPrime()
{
    is_prime[0] = is_prime[1] = false;

    for (ll i = 2; i * i <= bg; i++)
    {

        if (is_prime[i] && i * i <= bg)
        {

            for (ll j = i * i; j <= bg; j += i)
            {
                is_prime[j] = false;
            }
        }
    }
}

bool comparefn(lpr a, lpr b)
{
    if (a.S != b.S)
        return a.S < b.S;
    return false;
}

const int MAX = 1e5 + 10;
vector<vi> v(MAX);
vector<int> vis(MAX);

void dfs(int u, int c, vector<pi> &r)
{
    vis[u] = 1;
    for (int i = 0; i < v[u].size(); ++i)
    {
        if (vis[v[u][i]] == 1)
            continue;
        r.PB({c + 1, v[u][i]});
        dfs(v[u][i], c + 1, r);
    }
}

void initialize()
{
    for (int i = 0; i < MAX; ++i)
    {
        vis[i] = 0;
    }
}

void solve()
{
    int n, p = 0,m = 0;
    cin >> n;
    vi v(n);
    REP(i,0,n){
        cin>>v[i];
        if(v[i] > 0)p++;
        else m++;
    }
    
    if(m == 0){
        cout << 0 << nl;return;
    }
    if(n < 4){
        cout << m << nl;
        return;
    }
    

    int k = n / 2;
    if(n&1)k++;

    int mm = n - k;
    if(mm &1)k++;
    cout <<abs( k - p)<<nl;
   
}
int main()
{
    fast;
    // findPrime();
    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }
    // solve();
    return 0;
}
