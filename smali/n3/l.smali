.class public final synthetic Ln3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/m$h$a;


# instance fields
.field public final synthetic a:Ln3/m;

.field public final synthetic b:Ln3/m$d;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Ln3/m;Ln3/m$d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/l;->a:Ln3/m;

    iput-object p2, p0, Ln3/l;->b:Ln3/m$d;

    iput-boolean p3, p0, Ln3/l;->c:Z

    return-void
.end method


# virtual methods
.method public final a(ILu2/t0;[I)Ljava/util/List;
    .locals 6

    iget-object v0, p0, Ln3/l;->a:Ln3/m;

    iget-object v1, p0, Ln3/l;->b:Ln3/m$d;

    iget-boolean v2, p0, Ln3/l;->c:Z

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ln3/m;->q(Ln3/m;Ln3/m$d;ZILu2/t0;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
