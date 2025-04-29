.class public final synthetic Ll6/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/h2;

.field public final synthetic b:[I

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ll6/h2;[ILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/e2;->a:Ll6/h2;

    iput-object p2, p0, Ll6/e2;->b:[I

    iput-object p3, p0, Ll6/e2;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ll6/e2;->a:Ll6/h2;

    iget-object v1, p0, Ll6/e2;->b:[I

    iget-object v2, p0, Ll6/e2;->c:Ljava/util/List;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Ll6/h2;->q(Ll6/h2;[ILjava/util/List;Landroid/database/Cursor;)V

    return-void
.end method
