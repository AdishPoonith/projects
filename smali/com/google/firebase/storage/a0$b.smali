.class public Lcom/google/firebase/storage/a0$b;
.super Lcom/google/firebase/storage/s$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/s<",
        "Lcom/google/firebase/storage/a0$b;",
        ">.b;"
    }
.end annotation


# instance fields
.field private final c:J

.field private final d:Landroid/net/Uri;

.field private final e:Lcom/google/firebase/storage/k;

.field final synthetic f:Lcom/google/firebase/storage/a0;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/a0;Ljava/lang/Exception;JLandroid/net/Uri;Lcom/google/firebase/storage/k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/a0$b;->f:Lcom/google/firebase/storage/a0;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/s$b;-><init>(Lcom/google/firebase/storage/s;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/storage/a0$b;->c:J

    iput-object p5, p0, Lcom/google/firebase/storage/a0$b;->d:Landroid/net/Uri;

    iput-object p6, p0, Lcom/google/firebase/storage/a0$b;->e:Lcom/google/firebase/storage/k;

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/a0$b;->c:J

    return-wide v0
.end method

.method public e()Lcom/google/firebase/storage/k;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/a0$b;->e:Lcom/google/firebase/storage/k;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/storage/a0$b;->f:Lcom/google/firebase/storage/a0;

    invoke-virtual {v0}, Lcom/google/firebase/storage/a0;->q0()J

    move-result-wide v0

    return-wide v0
.end method
