.class public final Lja/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lea/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lja/j;->e(Lja/b;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TT;>;",
        "Lea/a;"
    }
.end annotation


# instance fields
.field final synthetic j:Lja/b;


# direct methods
.method public constructor <init>(Lja/b;)V
    .locals 0

    iput-object p1, p0, Lja/j$a;->j:Lja/b;

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

    iget-object v0, p0, Lja/j$a;->j:Lja/b;

    invoke-interface {v0}, Lja/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
