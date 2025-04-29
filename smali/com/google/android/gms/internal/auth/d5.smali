.class public final Lcom/google/android/gms/internal/auth/d5;
.super Lcom/google/android/gms/internal/auth/g2;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/h3;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/auth/d5;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/auth/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/auth/d5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/d5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/d5;->zzb:Lcom/google/android/gms/internal/auth/d5;

    const-class v1, Lcom/google/android/gms/internal/auth/d5;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/auth/g2;->f(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/g2;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/g2;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/auth/g2;->c()Lcom/google/android/gms/internal/auth/j2;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/d5;->zzd:Lcom/google/android/gms/internal/auth/j2;

    return-void
.end method

.method static synthetic i()Lcom/google/android/gms/internal/auth/d5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/d5;->zzb:Lcom/google/android/gms/internal/auth/d5;

    return-object v0
.end method

.method public static j([B)Lcom/google/android/gms/internal/auth/d5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/d5;->zzb:Lcom/google/android/gms/internal/auth/d5;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/auth/g2;->b(Lcom/google/android/gms/internal/auth/g2;[B)Lcom/google/android/gms/internal/auth/g2;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/auth/d5;

    return-object p0
.end method


# virtual methods
.method protected final g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/auth/d5;->zzb:Lcom/google/android/gms/internal/auth/d5;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/auth/c5;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/auth/c5;-><init>(Lcom/google/android/gms/internal/auth/b5;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/auth/d5;

    invoke-direct {p1}, Lcom/google/android/gms/internal/auth/d5;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "zzd"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/auth/d5;->zzb:Lcom/google/android/gms/internal/auth/d5;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/auth/g2;->e(Lcom/google/android/gms/internal/auth/g3;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final k()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d5;->zzd:Lcom/google/android/gms/internal/auth/j2;

    return-object v0
.end method
