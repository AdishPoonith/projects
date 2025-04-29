.class public final Lja/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lja/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lja/f;->b(Lda/p;)Lja/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lja/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lda/p;


# direct methods
.method public constructor <init>(Lda/p;)V
    .locals 0

    iput-object p1, p0, Lja/f$a;->a:Lda/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lja/f$a;->a:Lda/p;

    invoke-static {v0}, Lja/e;->a(Lda/p;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
