.class public final synthetic Ll6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/i0;

.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lw5/q;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Ljava/util/Set;Ljava/util/List;Lw5/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/v;->a:Ll6/i0;

    iput-object p2, p0, Ll6/v;->b:Ljava/util/Set;

    iput-object p3, p0, Ll6/v;->c:Ljava/util/List;

    iput-object p4, p0, Ll6/v;->d:Lw5/q;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ll6/v;->a:Ll6/i0;

    iget-object v1, p0, Ll6/v;->b:Ljava/util/Set;

    iget-object v2, p0, Ll6/v;->c:Ljava/util/List;

    iget-object v3, p0, Ll6/v;->d:Lw5/q;

    invoke-static {v0, v1, v2, v3}, Ll6/i0;->n(Ll6/i0;Ljava/util/Set;Ljava/util/List;Lw5/q;)Ll6/m;

    move-result-object v0

    return-object v0
.end method
