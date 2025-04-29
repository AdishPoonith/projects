.class final Lcom/google/android/gms/internal/firebase-auth-api/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:J

.field final b:Ljava/util/List;

.field final c:Z

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/util/concurrent/ScheduledFuture;

.field g:Z

.field h:Z

.field i:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c1;->g:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c1;->h:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c1;->i:Z

    iput-wide p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/c1;->a:J

    iput-boolean p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/c1;->c:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/c1;->b:Ljava/util/List;

    return-void
.end method
