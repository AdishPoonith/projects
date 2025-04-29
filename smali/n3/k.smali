.class public final synthetic Ln3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/m$h$a;


# instance fields
.field public final synthetic a:Ln3/m$d;

.field public final synthetic b:[I


# direct methods
.method public synthetic constructor <init>(Ln3/m$d;[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/k;->a:Ln3/m$d;

    iput-object p2, p0, Ln3/k;->b:[I

    return-void
.end method


# virtual methods
.method public final a(ILu2/t0;[I)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Ln3/k;->a:Ln3/m$d;

    iget-object v1, p0, Ln3/k;->b:[I

    invoke-static {v0, v1, p1, p2, p3}, Ln3/m;->o(Ln3/m$d;[IILu2/t0;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
