.class public final Lp7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/g;


# instance fields
.field private final a:Lp7/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp7/j;

    invoke-direct {v0}, Lp7/j;-><init>()V

    iput-object v0, p0, Lp7/o;->a:Lp7/j;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Li7/a;IILjava/util/Map;)Ll7/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Li7/a;",
            "II",
            "Ljava/util/Map<",
            "Li7/c;",
            "*>;)",
            "Ll7/b;"
        }
    .end annotation

    sget-object v0, Li7/a;->x:Li7/a;

    if-ne p2, v0, :cond_0

    iget-object v1, p0, Lp7/o;->a:Lp7/j;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "0"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Li7/a;->q:Li7/a;

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lp7/j;->a(Ljava/lang/String;Li7/a;IILjava/util/Map;)Ll7/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Can only encode UPC-A, but got "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
