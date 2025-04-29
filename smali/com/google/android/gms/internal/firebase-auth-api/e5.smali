.class public final Lcom/google/android/gms/internal/firebase-auth-api/e5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final b:Lcom/google/android/gms/internal/firebase-auth-api/e5;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/e5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/e5;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/e5;->b:Lcom/google/android/gms/internal/firebase-auth-api/e5;

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/firebase-auth-api/e5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/e5;->b:Lcom/google/android/gms/internal/firebase-auth-api/e5;

    return-object v0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/firebase-auth-api/w6;I)Lcom/google/android/gms/internal/firebase-auth-api/q5;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/d5;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/d5;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/q5;

    return-object p1
.end method
