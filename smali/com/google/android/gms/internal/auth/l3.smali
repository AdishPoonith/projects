.class final Lcom/google/android/gms/internal/auth/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/s3;


# instance fields
.field private final a:Lcom/google/android/gms/internal/auth/g3;

.field private final b:Lcom/google/android/gms/internal/auth/j4;

.field private final c:Lcom/google/android/gms/internal/auth/x1;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/auth/j4;Lcom/google/android/gms/internal/auth/x1;Lcom/google/android/gms/internal/auth/g3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/l3;->b:Lcom/google/android/gms/internal/auth/j4;

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/l3;->c:Lcom/google/android/gms/internal/auth/x1;

    iput-object p3, p0, Lcom/google/android/gms/internal/auth/l3;->a:Lcom/google/android/gms/internal/auth/g3;

    return-void
.end method

.method static f(Lcom/google/android/gms/internal/auth/j4;Lcom/google/android/gms/internal/auth/x1;Lcom/google/android/gms/internal/auth/g3;)Lcom/google/android/gms/internal/auth/l3;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/l3;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/auth/l3;-><init>(Lcom/google/android/gms/internal/auth/j4;Lcom/google/android/gms/internal/auth/x1;Lcom/google/android/gms/internal/auth/g3;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;[BIILcom/google/android/gms/internal/auth/d1;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/auth/g2;

    iget-object p3, p2, Lcom/google/android/gms/internal/auth/g2;->zzc:Lcom/google/android/gms/internal/auth/k4;

    invoke-static {}, Lcom/google/android/gms/internal/auth/k4;->a()Lcom/google/android/gms/internal/auth/k4;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/k4;->c()Lcom/google/android/gms/internal/auth/k4;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/auth/g2;->zzc:Lcom/google/android/gms/internal/auth/k4;

    :goto_0
    check-cast p1, Lcom/google/android/gms/internal/auth/f2;

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/l3;->b:Lcom/google/android/gms/internal/auth/j4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/j4;->e(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/l3;->c:Lcom/google/android/gms/internal/auth/x1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/x1;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/l3;->c:Lcom/google/android/gms/internal/auth/x1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/x1;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/b2;

    const/4 p1, 0x0

    throw p1
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/l3;->b:Lcom/google/android/gms/internal/auth/j4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/j4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/l3;->b:Lcom/google/android/gms/internal/auth/j4;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/auth/j4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/l3;->b:Lcom/google/android/gms/internal/auth/j4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/auth/u3;->f(Lcom/google/android/gms/internal/auth/j4;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/l3;->b:Lcom/google/android/gms/internal/auth/j4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/auth/j4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    return p1
.end method

.method public final zzd()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/l3;->a:Lcom/google/android/gms/internal/auth/g3;

    check-cast v0, Lcom/google/android/gms/internal/auth/g2;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/e2;

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/f3;->zzg()Lcom/google/android/gms/internal/auth/g3;

    move-result-object v0

    return-object v0
.end method
