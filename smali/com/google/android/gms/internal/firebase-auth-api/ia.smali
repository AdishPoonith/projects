.class public final Lcom/google/android/gms/internal/firebase-auth-api/ia;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/android/gms/internal/firebase-auth-api/ia;

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/ia;

.field public static final d:Lcom/google/android/gms/internal/firebase-auth-api/ia;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ia;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ia;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ia;->b:Lcom/google/android/gms/internal/firebase-auth-api/ia;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ia;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ia;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ia;->c:Lcom/google/android/gms/internal/firebase-auth-api/ia;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ia;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ia;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ia;->d:Lcom/google/android/gms/internal/firebase-auth-api/ia;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ia;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ia;->a:Ljava/lang/String;

    return-object v0
.end method
