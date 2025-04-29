.class final Lz3/k;
.super Lz3/p;
.source "SourceFile"


# instance fields
.field final synthetic s:Landroid/content/Context;

.field final synthetic t:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/f;Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 0

    iput-object p2, p0, Lz3/k;->s:Landroid/content/Context;

    iput-object p3, p0, Lz3/k;->t:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {p0, p1}, Lz3/p;-><init>(Lcom/google/android/gms/common/api/f;)V

    return-void
.end method


# virtual methods
.method protected final synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 2

    new-instance v0, Ly3/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Ly3/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected final bridge synthetic l(Lcom/google/android/gms/common/api/a$b;)V
    .locals 2

    check-cast p1, Lz3/i;

    invoke-virtual {p1}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lz3/w;

    new-instance v0, Lz3/j;

    invoke-direct {v0, p0}, Lz3/j;-><init>(Lz3/k;)V

    iget-object v1, p0, Lz3/k;->t:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {p1, v0, v1}, Lz3/w;->I2(Lz3/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
