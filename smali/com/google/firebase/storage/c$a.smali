.class public Lcom/google/firebase/storage/c$a;
.super Lcom/google/firebase/storage/s$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/s<",
        "Lcom/google/firebase/storage/c$a;",
        ">.b;"
    }
.end annotation


# instance fields
.field private final c:J

.field final synthetic d:Lcom/google/firebase/storage/c;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/c;Ljava/lang/Exception;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/c$a;->d:Lcom/google/firebase/storage/c;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/s$b;-><init>(Lcom/google/firebase/storage/s;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/storage/c$a;->c:J

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/c$a;->c:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/storage/c$a;->d:Lcom/google/firebase/storage/c;

    invoke-virtual {v0}, Lcom/google/firebase/storage/c;->m0()J

    move-result-wide v0

    return-wide v0
.end method
