.class public final synthetic Lb6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/util/Map$Entry;

.field public final synthetic k:Lg6/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lg6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/u;->j:Ljava/util/Map$Entry;

    iput-object p2, p0, Lb6/u;->k:Lg6/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb6/u;->j:Ljava/util/Map$Entry;

    iget-object v1, p0, Lb6/u;->k:Lg6/a;

    invoke-static {v0, v1}, Lb6/v;->b(Ljava/util/Map$Entry;Lg6/a;)V

    return-void
.end method
