.class public final synthetic Ll6/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/d2;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ll6/d2;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/a2;->a:Ll6/d2;

    iput-object p2, p0, Ll6/a2;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ll6/a2;->a:Ll6/d2;

    iget-object v1, p0, Ll6/a2;->b:Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Ll6/d2;->n(Ll6/d2;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method
