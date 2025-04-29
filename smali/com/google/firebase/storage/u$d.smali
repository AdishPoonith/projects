.class public Lcom/google/firebase/storage/u$d;
.super Lcom/google/firebase/storage/s$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/s<",
        "Lcom/google/firebase/storage/u$d;",
        ">.b;"
    }
.end annotation


# instance fields
.field private final c:J

.field final synthetic d:Lcom/google/firebase/storage/u;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/u;Ljava/lang/Exception;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/u$d;->d:Lcom/google/firebase/storage/u;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/s$b;-><init>(Lcom/google/firebase/storage/s;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/storage/u$d;->c:J

    return-void
.end method
