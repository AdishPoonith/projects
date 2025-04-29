.class public final Lja/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lja/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lja/b<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final a:Lja/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lja/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lda/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lda/l<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lja/b;Lda/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lja/b<",
            "+TT;>;",
            "Lda/l<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/k;->a:Lja/b;

    iput-object p2, p0, Lja/k;->b:Lda/l;

    return-void
.end method

.method public static final synthetic a(Lja/k;)Lja/b;
    .locals 0

    iget-object p0, p0, Lja/k;->a:Lja/b;

    return-object p0
.end method

.method public static final synthetic b(Lja/k;)Lda/l;
    .locals 0

    iget-object p0, p0, Lja/k;->b:Lda/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lja/k$a;

    invoke-direct {v0, p0}, Lja/k$a;-><init>(Lja/k;)V

    return-object v0
.end method
