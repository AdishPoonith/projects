.class final Lz3/j;
.super Lz3/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lz3/k;


# direct methods
.method constructor <init>(Lz3/k;)V
    .locals 0

    iput-object p1, p0, Lz3/j;->a:Lz3/k;

    invoke-direct {p0}, Lz3/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final C2(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz3/j;->a:Lz3/k;

    iget-object v0, v0, Lz3/k;->s:Landroid/content/Context;

    invoke-static {v0}, Lz3/r;->c(Landroid/content/Context;)Lz3/r;

    move-result-object v0

    iget-object v1, p0, Lz3/j;->a:Lz3/k;

    iget-object v1, v1, Lz3/k;->t:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {v0, v1, p1}, Lz3/r;->e(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    :cond_0
    iget-object v0, p0, Lz3/j;->a:Lz3/k;

    new-instance v1, Ly3/b;

    invoke-direct {v1, p1, p2}, Ly3/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
