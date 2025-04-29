.class public Lcom/google/firebase/storage/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/storage/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/Exception;

.field final synthetic b:Lcom/google/firebase/storage/s;


# direct methods
.method public constructor <init>(Lcom/google/firebase/storage/s;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/s$b;->b:Lcom/google/firebase/storage/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lcom/google/firebase/storage/s;->isCanceled()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/api/Status;

    :goto_0
    invoke-static {p1}, Lcom/google/firebase/storage/j;->c(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/storage/j;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lcom/google/firebase/storage/s$b;->a:Ljava/lang/Exception;

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/storage/s;->B()I

    move-result p1

    const/16 p2, 0x40

    if-ne p1, p2, :cond_1

    sget-object p1, Lcom/google/android/gms/common/api/Status;->r:Lcom/google/android/gms/common/api/Status;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    iput-object p2, p0, Lcom/google/firebase/storage/s$b;->a:Ljava/lang/Exception;

    :goto_2
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/s$b;->a:Ljava/lang/Exception;

    return-object v0
.end method

.method public b()Lcom/google/firebase/storage/l;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/storage/s$b;->c()Lcom/google/firebase/storage/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/storage/s;->I()Lcom/google/firebase/storage/l;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/firebase/storage/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/firebase/storage/s<",
            "TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/storage/s$b;->b:Lcom/google/firebase/storage/s;

    return-object v0
.end method
