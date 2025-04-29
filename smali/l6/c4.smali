.class public final synthetic Ll6/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/e4;

.field public final synthetic b:Lj6/g1;

.field public final synthetic c:Ll6/e4$c;


# direct methods
.method public synthetic constructor <init>(Ll6/e4;Lj6/g1;Ll6/e4$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/c4;->a:Ll6/e4;

    iput-object p2, p0, Ll6/c4;->b:Lj6/g1;

    iput-object p3, p0, Ll6/c4;->c:Ll6/e4$c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ll6/c4;->a:Ll6/e4;

    iget-object v1, p0, Ll6/c4;->b:Lj6/g1;

    iget-object v2, p0, Ll6/c4;->c:Ll6/e4$c;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Ll6/e4;->l(Ll6/e4;Lj6/g1;Ll6/e4$c;Landroid/database/Cursor;)V

    return-void
.end method
