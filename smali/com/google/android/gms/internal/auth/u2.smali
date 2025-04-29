.class abstract Lcom/google/android/gms/internal/auth/u2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/auth/u2;

.field private static final b:Lcom/google/android/gms/internal/auth/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/auth/q2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/q2;-><init>(Lcom/google/android/gms/internal/auth/p2;)V

    sput-object v0, Lcom/google/android/gms/internal/auth/u2;->a:Lcom/google/android/gms/internal/auth/u2;

    new-instance v0, Lcom/google/android/gms/internal/auth/s2;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/s2;-><init>(Lcom/google/android/gms/internal/auth/r2;)V

    sput-object v0, Lcom/google/android/gms/internal/auth/u2;->b:Lcom/google/android/gms/internal/auth/u2;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/auth/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c()Lcom/google/android/gms/internal/auth/u2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/u2;->a:Lcom/google/android/gms/internal/auth/u2;

    return-object v0
.end method

.method static d()Lcom/google/android/gms/internal/auth/u2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/u2;->b:Lcom/google/android/gms/internal/auth/u2;

    return-object v0
.end method


# virtual methods
.method abstract a(Ljava/lang/Object;J)V
.end method

.method abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
