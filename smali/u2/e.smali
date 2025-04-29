.class public final synthetic Lu2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/u$c;


# instance fields
.field public final synthetic a:Lu2/f;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lu2/f;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/e;->a:Lu2/f;

    iput-object p2, p0, Lu2/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lu2/u;Ls1/y3;)V
    .locals 2

    iget-object v0, p0, Lu2/e;->a:Lu2/f;

    iget-object v1, p0, Lu2/e;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2}, Lu2/f;->F(Lu2/f;Ljava/lang/Object;Lu2/u;Ls1/y3;)V

    return-void
.end method
