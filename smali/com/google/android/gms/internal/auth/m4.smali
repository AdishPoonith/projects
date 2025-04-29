.class final Lcom/google/android/gms/internal/auth/m4;
.super Lcom/google/android/gms/internal/auth/j4;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/j4;-><init>()V

    return-void
.end method


# virtual methods
.method final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/auth/g2;

    iget-object p1, p1, Lcom/google/android/gms/internal/auth/g2;->zzc:Lcom/google/android/gms/internal/auth/k4;

    return-object p1
.end method

.method final bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/auth/k4;->a()Lcom/google/android/gms/internal/auth/k4;

    move-result-object v0

    check-cast p2, Lcom/google/android/gms/internal/auth/k4;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/auth/k4;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/auth/k4;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/auth/k4;->b(Lcom/google/android/gms/internal/auth/k4;Lcom/google/android/gms/internal/auth/k4;)Lcom/google/android/gms/internal/auth/k4;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/auth/k4;->c()Lcom/google/android/gms/internal/auth/k4;

    move-result-object v0

    return-object v0
.end method

.method final bridge synthetic d(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Lcom/google/android/gms/internal/auth/k4;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/auth/k4;->f(ILjava/lang/Object;)V

    return-void
.end method

.method final e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/auth/g2;

    iget-object p1, p1, Lcom/google/android/gms/internal/auth/g2;->zzc:Lcom/google/android/gms/internal/auth/k4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/k4;->d()V

    return-void
.end method

.method final synthetic f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/android/gms/internal/auth/k4;

    check-cast p1, Lcom/google/android/gms/internal/auth/g2;

    iput-object p2, p1, Lcom/google/android/gms/internal/auth/g2;->zzc:Lcom/google/android/gms/internal/auth/k4;

    return-void
.end method
